package com.example.demo.feign.basics.api;

import com.example.demo.feign.basics.bo.AppletConfigBO;
import com.example.demo.feign.basics.dto.AppletConfigDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * <p>
 * 租户小程序配置表 api
 * </p>
 *
 * @author lml
 * @since 2022-11-08
 */
@FeignClient(
        value = "x-basics-service",
        path = "/v1/basics/applet-config",
        contextId = "BasicsIAppletConfigApi"
)
public interface IAppletConfigApi {


    /**
     * 新增修改
     *
     * @param dto
     * @return
     */
    @PostMapping(value = "/add-modify")
    Long addModify(@RequestBody AppletConfigDTO dto);


    /**
     * 删除
     *
     * @param id
     */
    @GetMapping(value = "/delete/{id}")
    void delete(@PathVariable Long id);

    /**
     * 根据渠道查询配置信息
     *
     * @param dto
     * @return
     */
    @PostMapping(value = "/channel-query")
    List<AppletConfigBO> channelQuery(@RequestBody AppletConfigDTO dto);



    /**
     * 根据appId查询信息
     *
     */
    @GetMapping(value = "/appId/{appId}")
    List<AppletConfigBO>queryByAppId(@PathVariable String appId);



    /**
     * 根据租户ID查询信息
     *
     */
    @GetMapping(value = "/tenant/{tenantId}")
    AppletConfigBO queryByTenantId(@PathVariable Long tenantId);



}
