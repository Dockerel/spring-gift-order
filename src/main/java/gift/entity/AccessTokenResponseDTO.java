package gift.entity;

public class AccessTokenResponseDTO {
    private String accessToken;

    public AccessTokenResponseDTO(String accessToken) {
        this.accessToken = accessToken;
    }

    public AccessTokenResponseDTO() {
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
