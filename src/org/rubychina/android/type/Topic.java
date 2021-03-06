/*Copyright (C) 2012 Longerian (http://www.longerian.me)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/
package org.rubychina.android.type;

import com.google.gson.annotations.SerializedName;

public class Topic {
	
	@SerializedName("_id")  
	private int id;
	
	private String title;
	
	private String body;
	
	@SerializedName("body_html")  
	private String bodyHTML;
	
	@SerializedName("created_at")  
	private String createdAt;
	
	@SerializedName("updated_at")  
	private String updatedAt;
	
	@SerializedName("replied_at")  
	private String repliedAt;
	
	@SerializedName("replies_count")  
	private int repliesCount;
	
	@SerializedName("node_name")  
	private String nodeName;
	
	@SerializedName("node_id")  
	private int nodeID;
	
	@SerializedName("last_reply_user_login")  
	private String lastReplyUserLogin;
	
	private User user;

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getBody() {
		return body;
	}

	public String getBodyHTML() {
		return bodyHTML;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public String getRepliedAt() {
		return repliedAt;
	}

	public int getRepliesCount() {
		return repliesCount;
	}

	public String getNodeName() {
		return nodeName;
	}

	public int getNodeID() {
		return nodeID;
	}

	public String getLastReplyUserLogin() {
		return lastReplyUserLogin;
	}

	public User getUser() {
		return user;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Topic other = (Topic) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
