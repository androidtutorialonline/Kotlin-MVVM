package com.app.systemtask.data.model


import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GithubReposItem(
    @Json(name = "archive_url")
    val archive_url: String? = "",
    @Json(name = "assignees_url")
    val assignees_url: String? = "",
    @Json(name = "blobs_url")
    val blobs_url: String? = "",
    @Json(name = "branches_url")
    val branches_url: String? = "",
    @Json(name = "collaborators_url")
    val collaborators_url: String? = "",
    @Json(name = "comments_url")
    val comments_url: String? = "",
    @Json(name = "commits_url")
    val commits_url: String? = "",
    @Json(name = "compare_url")
    val compare_url: String? = "",
    @Json(name = "contents_url")
    val contents_url: String? = "",
    @Json(name = "contributors_url")
    val contributorsUrl: String? = "",
    @Json(name = "deployments_url")
    val deploymentsUrl: String? = "",
    @Json(name = "description")
    val description: String? = "",
    @Json(name = "downloads_url")
    val downloadsUrl: String? = "",
    @Json(name = "events_url")
    val eventsUrl: String? = "",
    @Json(name = "fork")
    val fork: Boolean? = false,
    @Json(name = "forks_url")
    val forksUrl: String? = "",
    @Json(name = "full_name")
    val full_name: String? = "",
    @Json(name = "git_commits_url")
    val gitCommitsUrl: String? = "",
    @Json(name = "git_refs_url")
    val gitRefsUrl: String? = "",
    @Json(name = "git_tags_url")
    val gitTagsUrl: String? = "",
    @Json(name = "hooks_url")
    val hooksUrl: String? = "",
    @Json(name = "html_url")
    val htmlUrl: String? = "",
    @Json(name = "id")
    val id: Int? = 0,
    @Json(name = "issue_comment_url")
    val issueCommentUrl: String? = "",
    @Json(name = "issue_events_url")
    val issueEventsUrl: String? = "",
    @Json(name = "issues_url")
    val issuesUrl: String? = "",
    @Json(name = "keys_url")
    val keysUrl: String? = "",
    @Json(name = "labels_url")
    val labelsUrl: String? = "",
    @Json(name = "languages_url")
    val languagesUrl: String? = "",
    @Json(name = "merges_url")
    val mergesUrl: String? = "",
    @Json(name = "milestones_url")
    val milestonesUrl: String? = "",
    @Json(name = "name")
    val name: String? = "",
    @Json(name = "node_id")
    val nodeId: String? = "",
    @Json(name = "notifications_url")
    val notificationsUrl: String? = "",
    @Json(name = "owner")
    val owner: Owner? = Owner(),
    @Json(name = "private")
    val `private`: Boolean? = false,
    @Json(name = "pulls_url")
    val pullsUrl: String? = "",
    @Json(name = "releases_url")
    val releasesUrl: String? = "",
    @Json(name = "stargazers_url")
    val stargazersUrl: String? = "",
    @Json(name = "statuses_url")
    val statusesUrl: String? = "",
    @Json(name = "subscribers_url")
    val subscribersUrl: String? = "",
    @Json(name = "subscription_url")
    val subscriptionUrl: String? = "",
    @Json(name = "tags_url")
    val tagsUrl: String? = "",
    @Json(name = "teams_url")
    val teamsUrl: String? = "",
    @Json(name = "trees_url")
    val treesUrl: String? = "",
    @Json(name = "url")
    val url: String? = ""
): Parcelable