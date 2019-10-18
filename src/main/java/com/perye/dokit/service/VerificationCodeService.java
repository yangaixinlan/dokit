package com.perye.dokit.service;

import com.perye.dokit.entity.VerificationCode;
import com.perye.dokit.vo.EmailVo;

public interface VerificationCodeService {

    /**
     * 发送邮件验证码
     * @param code
     */
    EmailVo sendEmail(VerificationCode code);

    /**
     * 验证
     * @param code
     */
    void validated(VerificationCode code);
}
