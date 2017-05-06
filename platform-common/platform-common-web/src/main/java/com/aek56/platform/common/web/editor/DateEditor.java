package com.aek56.platform.common.web.editor;

import com.aek56.platform.common.utils.DateHelper;

import java.beans.PropertyEditorSupport;

/**
 * @author zj@aek56.com
 */
public class DateEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) {
        setValue(DateHelper.parseDate(text));
    }

}
