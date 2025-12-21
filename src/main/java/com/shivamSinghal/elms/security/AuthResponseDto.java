package com.shivamSinghal.elms.security;

public class AuthResponseDto {
    private String token;
    private String type = "Bearer";
    private long expiresIn;

    
    public AuthResponseDto() {
    	
    }
    
    public AuthResponseDto(String token, long expiresIn) {
        this.token = token;
        this.expiresIn = expiresIn;
    }

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(long expiresIn) {
		this.expiresIn = expiresIn;
	}

	@Override
	public String toString() {
		return "AuthResponseDTO [token=" + token + ", type=" + type + ", expiresIn=" + expiresIn + "]";
	}
    
    
}
