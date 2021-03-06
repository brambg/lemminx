/**
 *  Copyright (c) 2019 Red Hat, Inc. and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Red Hat Inc. - initial API and implementation
 */
package org.eclipse.lemminx.extensions.prolog;

import org.eclipse.lemminx.services.extensions.CompletionParticipantAdapter;
import org.eclipse.lemminx.services.extensions.ICompletionRequest;
import org.eclipse.lemminx.services.extensions.ICompletionResponse;

/**
 * PrologCompletionParticipant
 */
public class PrologCompletionParticipant extends CompletionParticipantAdapter {

	@Override
	public void onAttributeName(boolean generateValue, ICompletionRequest request, ICompletionResponse response)
			throws Exception {
		PrologModel.computeAttributeNameCompletionResponses(request, response, request.getReplaceRange(),
				request.getXMLDocument(), request.getFormattingSettings());
	}

	@Override
	public void onAttributeValue(String valuePrefix, ICompletionRequest request, ICompletionResponse response)
			throws Exception {
		PrologModel.computeValueCompletionResponses(request, response, request.getReplaceRange(),
				request.getXMLDocument(), request.getFormattingSettings());
	}

}