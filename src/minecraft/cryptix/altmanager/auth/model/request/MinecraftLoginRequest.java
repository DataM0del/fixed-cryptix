package cryptix.altmanager.auth.model.request;

public class MinecraftLoginRequest
{
    private final String identityToken;

    public MinecraftLoginRequest(String identityToken)
    {
        this.identityToken = identityToken;
    }

    public String getIdentityToken()
    {
        return identityToken;
    }
}
