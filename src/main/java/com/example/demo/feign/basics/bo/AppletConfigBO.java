package com.example.demo.feign.basics.bo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 租户小程序配置表
 * </p>
 *
 * @author WEN
 * @since 2023-01-12
 */
@Data
@Accessors(chain = true)
public class AppletConfigBO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;

    private Long tenantId;

    private String tenantName;

    private String applicationCode;

    private String applicationName;

    private String appChannelCode;

    private String appChannelName;

    private String appId;

    private String appName;

    private String secret;

    private String messageDataFormat;

    private String authorizerAccessToken;

    private Integer expiresIn;

    private String authorizerRefreshToken;

    private String memo;

    private String releaseVersion;

    private String commitVersion;

    private String status;

    private String auditId;

    private Byte dr;

}
