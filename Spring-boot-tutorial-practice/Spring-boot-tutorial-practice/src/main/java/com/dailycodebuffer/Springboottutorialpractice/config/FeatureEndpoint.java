package com.dailycodebuffer.Springboottutorialpractice.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id = "features")
public class FeatureEndpoint {

    private final Map<String, Feature> featureMap =
            new ConcurrentHashMap<>();

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    private static class Feature {
        public FeatureEndpoint() {
            featureMap.put("Department", new Feature(true));
            featureMap.put("User", new Feature(false));
            featureMap.put("Authentication", new Feature(true));
        }

        @ReadOperation
        public Map<String, Feature> features() {
            return featureMap;
        }


        @ReadOperation
        public Feature feature(@Selector String featureName) {
            return featureMap.get(featureName);
        }


        private boolean isEnabled;

    }
}
