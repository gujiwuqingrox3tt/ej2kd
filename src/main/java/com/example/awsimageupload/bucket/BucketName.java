package com.example.awsimageupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("amigoscode-image-upload-210320");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
