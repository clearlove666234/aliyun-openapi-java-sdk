/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.foas.model.v20181111;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteFolderRequest extends RoaAcsRequest<DeleteFolderResponse> {
	
	public DeleteFolderRequest() {
		super("foas", "2018-11-11", "DeleteFolder", "foas");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/api/v2/projects/[projectName]/folders");
		setMethod(MethodType.DELETE);
	}

	private String path;

	private String projectName;

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
		if(path != null){
			putQueryParameter("path", path);
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putPathParameter("projectName", projectName);
		}
	}

	@Override
	public Class<DeleteFolderResponse> getResponseClass() {
		return DeleteFolderResponse.class;
	}

}
