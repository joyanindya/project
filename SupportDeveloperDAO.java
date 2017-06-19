package com.anindya.dao;

import com.anindya.entity.SupportDeveloper;

import java.util.List;

/**
 * Created by jcon928 on 6/18/2017.
 */
public interface SupportDeveloperDAO {

    boolean insertSupportDeveloperRecords(SupportDeveloper supportDeveloper) throws Exception;
    List<SupportDeveloper> getAllSupportDeveloperRecords() throws Exception;
    SupportDeveloper getSupportDeveloperRecordsByID(int supportDeveloperId) throws Exception;
    boolean updateSupportDeveloperRecords(SupportDeveloper supportDeveloper) throws Exception;
    boolean deleteSupportDeveloperRecords(int supportDeveloperId) throws Exception;
}
