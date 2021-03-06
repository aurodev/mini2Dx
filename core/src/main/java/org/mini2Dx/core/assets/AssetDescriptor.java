/*******************************************************************************
 * Copyright 2019 Viridian Software Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.mini2Dx.core.assets;

import org.mini2Dx.core.files.FileHandle;

public class AssetDescriptor<T> {
	private final String filePath;
	private final Class<T> clazz;
	private final AssetProperties<T> parameters;

	private FileHandle resolvedFileHandle;

	public AssetDescriptor(String filePath, Class<T> clazz) {
		this(filePath, clazz, null);
	}

	public AssetDescriptor(String filePath, Class<T> clazz, AssetProperties parameters) {
		super();
		this.filePath = filePath;
		this.clazz = clazz;
		this.parameters = parameters;
	}

	public String getFilePath() {
		return filePath;
	}

	public Class<T> getClazz() {
		return clazz;
	}

	public AssetProperties<T> getParameters() {
		return parameters;
	}

	public FileHandle getResolvedFileHandle() {
		return resolvedFileHandle;
	}

	public void setResolvedFileHandle(FileHandle resolvedFileHandle) {
		this.resolvedFileHandle = resolvedFileHandle;
	}
}
