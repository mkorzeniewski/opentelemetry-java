/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.sdk.extension.aws.resource;

import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;
import io.opentelemetry.sdk.autoconfigure.spi.ResourceProvider;
import io.opentelemetry.sdk.resources.Resource;

/**
 * {@link ResourceProvider} for automatically configuring {@link EksResource}.
 *
 * @deprecated Moved to <a
 *     href="https://github.com/open-telemetry/opentelemetry-java-contrib/tree/main/aws-resources">io.opentelemetry.contrib:opentelemetry-aws-resources</a>.
 */
@Deprecated
public final class EksResourceProvider implements ResourceProvider {
  @Override
  public Resource createResource(ConfigProperties config) {
    return EksResource.get();
  }
}
