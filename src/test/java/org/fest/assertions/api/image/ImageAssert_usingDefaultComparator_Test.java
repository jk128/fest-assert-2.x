/*
 * Created on Nov 29, 2010
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2010-2011 the original author or authors.
 */
package org.fest.assertions.api.image;

import static junit.framework.Assert.assertSame;
import static org.fest.assertions.test.ExpectedException.none;
import static org.mockito.MockitoAnnotations.initMocks;

import java.awt.image.BufferedImage;
import java.util.Comparator;

import org.fest.assertions.api.ImageAssert;
import org.fest.assertions.api.ImageAssertTest;
import org.fest.assertions.internal.Objects;
import org.fest.assertions.test.ExpectedException;
import org.junit.Before;
import org.junit.Rule;
import org.mockito.Mock;

/**
 * Tests for <code>{@link ImageAssert#usingComparator(java.util.Comparator)}</code> and
 * <code>{@link ImageAssert#usingDefaultComparator()}</code>.
 * 
 * @author Joel Costigliola
 */
public class ImageAssert_usingDefaultComparator_Test extends ImageAssertTest {

  @Rule
  public ExpectedException thrown = none();

  @Mock
  private Comparator<BufferedImage> comparator;

  @Before
  public void before() {
    initMocks(this);
  }

  @Override
  protected ImageAssert invoke_api_method() {
    return assertions.usingDefaultComparator();
  }

  @Override
  protected void verify_internal_effects() {
    assertSame(getObjects(assertions), Objects.instance());
  }
}