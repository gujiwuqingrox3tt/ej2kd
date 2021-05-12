package com.example.awsimageupload.datastore;

import com.example.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("3a22d7b8-1873-4468-a0f3-ec01d925af87"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("72011b09-c641-4fd7-b50a-4b66701c63d8"), "antoniojunior", null));
    }

    public static List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
