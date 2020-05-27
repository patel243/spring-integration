/*
 * Copyright 2017-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.integration.channel;

import org.reactivestreams.Publisher;

import org.springframework.integration.util.IntegrationReactiveUtils;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

/**
 * Utilities for adaptation {@link MessageChannel}s to the {@link Publisher}s.
 *
 * @author Artem Bilan
 *
 * @since 5.0
 *
 * @deprecated since 5.3 in favor of {@link IntegrationReactiveUtils}.
 */
@Deprecated
public final class MessageChannelReactiveUtils {

	private MessageChannelReactiveUtils() {
	}

	public static <T> Publisher<Message<T>> toPublisher(MessageChannel messageChannel) {
		return IntegrationReactiveUtils.messageChannelToFlux(messageChannel);
	}

}
