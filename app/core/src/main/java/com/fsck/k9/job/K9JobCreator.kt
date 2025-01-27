package com.fsck.k9.job

import com.evernote.android.job.Job
import com.evernote.android.job.JobCreator

class K9JobCreator(
        private val mailSyncJobManager: MailSyncJobManager
) : JobCreator {

    override fun create(tag: String): Job? {
        return when (tag) {
            MailSyncJob.TAG -> mailSyncJobManager.getJob()
            else -> null
        }
    }

}
