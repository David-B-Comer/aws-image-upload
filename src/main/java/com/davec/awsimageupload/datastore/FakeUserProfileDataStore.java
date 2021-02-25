package com.davec.awsimageupload.datastore;

import com.davec.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("dc5620b4-8c5c-49ff-aa5e-360f41fa868f"),"janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("9628c6e1-d1e9-41f1-8667-6197ca7c3c8d"),"antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
