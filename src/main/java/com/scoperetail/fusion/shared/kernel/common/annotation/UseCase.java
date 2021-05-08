/* ScopeRetail (C)2021 */
package com.scoperetail.fusion.shared.kernel.common.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

@Retention(RUNTIME)
@Target(TYPE)
@Documented
@Component
public @interface UseCase {

  /**
   * The value may indicate a suggestion for a logical component name, to be turned into a Spring
   * bean in case of an auto detected component.
   *
   * @return the suggested component name, if any (or empty String otherwise)
   */
  @AliasFor(annotation = Component.class)
  String value() default "";
}
