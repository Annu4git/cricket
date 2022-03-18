package com.cricket.app.utils;

public enum MessageStatus {

	Player_Not_Found {
		public String toString() {
			return "Player not found";
		}
	},
	Player_Deleted {
		public String toString() {
			return "Player deleted successfully!!";
		}
	}

}
