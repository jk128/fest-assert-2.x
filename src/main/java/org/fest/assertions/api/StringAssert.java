/*
 * Created on Dec 22, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.assertions.api;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.fest.assertions.core.EnumerableAssert;
import org.fest.assertions.internal.Strings;
import org.fest.util.VisibleForTesting;

/**
 * Assertion methods for {@code String}s.
 * <p>
 * To create a new instance of this class, invoke <code>{@link Assertions#assertThat(String)}</code>.
 * </p>
 *
 * @author Yvonne Wang
 * @author David DIDIER
 * @author Alex Ruiz
 */
public class StringAssert extends AbstractAssert<StringAssert, String> implements EnumerableAssert<StringAssert> {

  @VisibleForTesting Strings strings = Strings.instance();

  protected StringAssert(String actual) {
    super(actual, StringAssert.class);
  }

  /** {@inheritDoc} */
  public void isNullOrEmpty() {
    // TODO Auto-generated method stub

  }

  /** {@inheritDoc} */
  public void isEmpty() {
    // TODO Auto-generated method stub

  }

  /** {@inheritDoc} */
  public StringAssert isNotEmpty() {
    // TODO Auto-generated method stub
    return null;
  }

  /** {@inheritDoc} */
  public StringAssert hasSize(int expected) {
    // TODO Auto-generated method stub
    return null;
  }

  public StringAssert isEqualToIgnoringCase(String expected) {
    // TODO implement
    return null;
  }

  public StringAssert contains(String expected) {
    // TODO implement
    return null;
  }

  public StringAssert containsIgnoringCase(String expected) {
    // TODO implement
    return null;
  }

  public StringAssert doesNotContain(String expected) {
    // TODO implement
    return null;
  }

  public StringAssert startsWith(String expected) {
    // TODO implement
    return null;
  }

  public StringAssert endsWith(String expected) {
    // TODO implement
    return null;
  }

  /**
   * Verifies that the actual {@code String} matches the given regular expression.
   * @param regex the regular expression to which the actual {@code String} is to be matched.
   * @return {@code this} assertion object.
   * @throws NullPointerException if the given pattern is {@code null}.
   * @throws PatternSyntaxException if the regular expression's syntax is invalid.
   * @throws AssertionError if the actual {@code String} does not match the given pattern.
   */
  public StringAssert matches(String regex) {
    strings.assertMatches(info, actual, regex);
    return this;
  }

  public StringAssert doesNotMatch(String regex) {
    // TODO implement
    return null;
  }

  /**
   * Verifies that the actual {@code String} matches the given pattern.
   * @param pattern the given pattern.
   * @return {@code this} assertion object.
   * @throws NullPointerException if the given pattern is {@code null}.
   * @throws AssertionError if the actual {@code String} does not match the given pattern.
   */
  public StringAssert matches(Pattern pattern) {
    strings.assertMatches(info, actual, pattern);
    return this;
  }

  public StringAssert doesNotMatch(Pattern pattern) {
    // TODO implement
    return null;
  }
}
