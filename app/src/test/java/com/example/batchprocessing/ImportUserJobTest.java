package com.example.batchprocessing;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.batch.test.context.SpringBatchTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@SpringBatchTest
@ContextConfiguration(classes = {BatchConfiguration.class, JobCompletionNotificationListener.class, TestConfiguration.class})
public class ImportUserJobTest {
    @Autowired
    private Job importUserJob;

    @Autowired
    private JobLauncherTestUtils jobLauncherTestUtils;

    @Before
    public void before() {
        jobLauncherTestUtils.setJob(importUserJob);
    }
    @Test
    public void testJob() throws Exception {

        JobExecution jobExecution = jobLauncherTestUtils.launchJob();


        Assertions.assertEquals("COMPLETED", jobExecution.getExitStatus().getExitCode());
    }
}
