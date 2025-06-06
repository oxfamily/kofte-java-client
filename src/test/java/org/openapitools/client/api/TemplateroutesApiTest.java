/*
 * Köfte
 * Köfte Api V1
 *
 * The version of the OpenAPI document: 0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Context;
import java.io.File;
import org.openapitools.client.model.RenderRequest;
import org.openapitools.client.model.TemplateType;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TemplateroutesApi
 */
@Disabled
public class TemplateroutesApiTest {

    private final TemplateroutesApi api = new TemplateroutesApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTemplByIdTest() throws ApiException {
        String id = null;
        api.deleteTemplById(id);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findAllTest() throws ApiException {
        api.findAll();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findByContextTest() throws ApiException {
        Context context = null;
        api.findByContext(context);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findByIdsTest() throws ApiException {
        List<String> ids = null;
        api.findByIds(ids);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findByTypeTest() throws ApiException {
        TemplateType templateType = null;
        api.findByType(templateType);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findOneTest() throws ApiException {
        String templId = null;
        api.findOne(templId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void renderTest() throws ApiException {
        RenderRequest renderRequest = null;
        api.render(renderRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void upsertTest() throws ApiException {
        String title = null;
        TemplateType templateType = null;
        Context templateContext = null;
        File fileBytes = null;
        String id = null;
        String description = null;
        api.upsert(title, templateType, templateContext, fileBytes, id, description);
        // TODO: test validations
    }

}
