package com.naylorit.awsimagerepository.datastore;

import com.naylorit.awsimagerepository.user.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("51db8d3a-ee56-4d49-a1b4-901dbe36fb3d"), "franklinsmart", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("c73f8900-9300-48c7-9fbd-3b0618441ff7"), "natashabells", null));

    }

    public static List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
