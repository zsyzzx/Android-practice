package cn.seventeams.retrofit_demo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by seven on 2017/8/5.
 */

public class GithubRepo {
    private String name;
    private long id;
    /**
     * id : 99398524
     * full_name : zsyzzx/Android-practice
     * owner : {"login":"zsyzzx","id":14289158,"avatar_url":"https://avatars1.githubusercontent.com/u/14289158?v=4","gravatar_id":"","url":"https://api.github.com/users/zsyzzx","html_url":"https://github.com/zsyzzx","followers_url":"https://api.github.com/users/zsyzzx/followers","following_url":"https://api.github.com/users/zsyzzx/following{/other_user}","gists_url":"https://api.github.com/users/zsyzzx/gists{/gist_id}","starred_url":"https://api.github.com/users/zsyzzx/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/zsyzzx/subscriptions","organizations_url":"https://api.github.com/users/zsyzzx/orgs","repos_url":"https://api.github.com/users/zsyzzx/repos","events_url":"https://api.github.com/users/zsyzzx/events{/privacy}","received_events_url":"https://api.github.com/users/zsyzzx/received_events","type":"User","site_admin":false}
     * private : false
     * html_url : https://github.com/zsyzzx/Android-practice
     * description : 一些Android第三方库的练习使用代码
     * fork : false
     * url : https://api.github.com/repos/zsyzzx/Android-practice
     * forks_url : https://api.github.com/repos/zsyzzx/Android-practice/forks
     * keys_url : https://api.github.com/repos/zsyzzx/Android-practice/keys{/key_id}
     * collaborators_url : https://api.github.com/repos/zsyzzx/Android-practice/collaborators{/collaborator}
     * teams_url : https://api.github.com/repos/zsyzzx/Android-practice/teams
     * hooks_url : https://api.github.com/repos/zsyzzx/Android-practice/hooks
     * issue_events_url : https://api.github.com/repos/zsyzzx/Android-practice/issues/events{/number}
     * events_url : https://api.github.com/repos/zsyzzx/Android-practice/events
     * assignees_url : https://api.github.com/repos/zsyzzx/Android-practice/assignees{/user}
     * branches_url : https://api.github.com/repos/zsyzzx/Android-practice/branches{/branch}
     * tags_url : https://api.github.com/repos/zsyzzx/Android-practice/tags
     * blobs_url : https://api.github.com/repos/zsyzzx/Android-practice/git/blobs{/sha}
     * git_tags_url : https://api.github.com/repos/zsyzzx/Android-practice/git/tags{/sha}
     * git_refs_url : https://api.github.com/repos/zsyzzx/Android-practice/git/refs{/sha}
     * trees_url : https://api.github.com/repos/zsyzzx/Android-practice/git/trees{/sha}
     * statuses_url : https://api.github.com/repos/zsyzzx/Android-practice/statuses/{sha}
     * languages_url : https://api.github.com/repos/zsyzzx/Android-practice/languages
     * stargazers_url : https://api.github.com/repos/zsyzzx/Android-practice/stargazers
     * contributors_url : https://api.github.com/repos/zsyzzx/Android-practice/contributors
     * subscribers_url : https://api.github.com/repos/zsyzzx/Android-practice/subscribers
     * subscription_url : https://api.github.com/repos/zsyzzx/Android-practice/subscription
     * commits_url : https://api.github.com/repos/zsyzzx/Android-practice/commits{/sha}
     * git_commits_url : https://api.github.com/repos/zsyzzx/Android-practice/git/commits{/sha}
     * comments_url : https://api.github.com/repos/zsyzzx/Android-practice/comments{/number}
     * issue_comment_url : https://api.github.com/repos/zsyzzx/Android-practice/issues/comments{/number}
     * contents_url : https://api.github.com/repos/zsyzzx/Android-practice/contents/{+path}
     * compare_url : https://api.github.com/repos/zsyzzx/Android-practice/compare/{base}...{head}
     * merges_url : https://api.github.com/repos/zsyzzx/Android-practice/merges
     * archive_url : https://api.github.com/repos/zsyzzx/Android-practice/{archive_format}{/ref}
     * downloads_url : https://api.github.com/repos/zsyzzx/Android-practice/downloads
     * issues_url : https://api.github.com/repos/zsyzzx/Android-practice/issues{/number}
     * pulls_url : https://api.github.com/repos/zsyzzx/Android-practice/pulls{/number}
     * milestones_url : https://api.github.com/repos/zsyzzx/Android-practice/milestones{/number}
     * notifications_url : https://api.github.com/repos/zsyzzx/Android-practice/notifications{?since,all,participating}
     * labels_url : https://api.github.com/repos/zsyzzx/Android-practice/labels{/name}
     * releases_url : https://api.github.com/repos/zsyzzx/Android-practice/releases{/id}
     * deployments_url : https://api.github.com/repos/zsyzzx/Android-practice/deployments
     * created_at : 2017-08-05T04:17:09Z
     * updated_at : 2017-08-05T04:32:56Z
     * pushed_at : 2017-08-05T04:32:55Z
     * git_url : git://github.com/zsyzzx/Android-practice.git
     * ssh_url : git@github.com:zsyzzx/Android-practice.git
     * clone_url : https://github.com/zsyzzx/Android-practice.git
     * svn_url : https://github.com/zsyzzx/Android-practice
     * homepage : null
     * size : 127
     * stargazers_count : 0
     * watchers_count : 0
     * language : Java
     * has_issues : true
     * has_projects : true
     * has_downloads : true
     * has_wiki : true
     * has_pages : false
     * forks_count : 0
     * mirror_url : null
     * open_issues_count : 0
     * forks : 0
     * open_issues : 0
     * watchers : 0
     * default_branch : master
     */


    private String full_name;
    private OwnerBean owner;
    @SerializedName("private")
    private boolean privateX;
    private String description;
    private String url;
    private String issues_url;
    private String language;

    public String getName() {

        return name;
    }

    public long getId() {
        return id;
    }



    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public OwnerBean getOwner() {
        return owner;
    }

    public void setOwner(OwnerBean owner) {
        this.owner = owner;
    }

    public boolean isPrivateX() {
        return privateX;
    }

    public void setPrivateX(boolean privateX) {
        this.privateX = privateX;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIssues_url() {
        return issues_url;
    }

    public void setIssues_url(String issues_url) {
        this.issues_url = issues_url;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public static class OwnerBean {
        /**
         * login : zsyzzx
         * id : 14289158
         * avatar_url : https://avatars1.githubusercontent.com/u/14289158?v=4
         * gravatar_id :
         * url : https://api.github.com/users/zsyzzx
         * html_url : https://github.com/zsyzzx
         * followers_url : https://api.github.com/users/zsyzzx/followers
         * following_url : https://api.github.com/users/zsyzzx/following{/other_user}
         * gists_url : https://api.github.com/users/zsyzzx/gists{/gist_id}
         * starred_url : https://api.github.com/users/zsyzzx/starred{/owner}{/repo}
         * subscriptions_url : https://api.github.com/users/zsyzzx/subscriptions
         * organizations_url : https://api.github.com/users/zsyzzx/orgs
         * repos_url : https://api.github.com/users/zsyzzx/repos
         * events_url : https://api.github.com/users/zsyzzx/events{/privacy}
         * received_events_url : https://api.github.com/users/zsyzzx/received_events
         * type : User
         * site_admin : false
         */

        private String login;
        @SerializedName("id")
        private int idX;
        private String avatar_url;
        private String gravatar_id;
        private String url;
        private String html_url;
        private String followers_url;
        private String following_url;
        private String gists_url;
        private String starred_url;
        private String subscriptions_url;
        private String organizations_url;
        private String repos_url;
        private String events_url;
        private String received_events_url;
        private String type;
        private boolean site_admin;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public int getIdX() {
            return idX;
        }

        public void setIdX(int idX) {
            this.idX = idX;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public String getGravatar_id() {
            return gravatar_id;
        }

        public void setGravatar_id(String gravatar_id) {
            this.gravatar_id = gravatar_id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
        }

        public String getFollowers_url() {
            return followers_url;
        }

        public void setFollowers_url(String followers_url) {
            this.followers_url = followers_url;
        }

        public String getFollowing_url() {
            return following_url;
        }

        public void setFollowing_url(String following_url) {
            this.following_url = following_url;
        }

        public String getGists_url() {
            return gists_url;
        }

        public void setGists_url(String gists_url) {
            this.gists_url = gists_url;
        }

        public String getStarred_url() {
            return starred_url;
        }

        public void setStarred_url(String starred_url) {
            this.starred_url = starred_url;
        }

        public String getSubscriptions_url() {
            return subscriptions_url;
        }

        public void setSubscriptions_url(String subscriptions_url) {
            this.subscriptions_url = subscriptions_url;
        }

        public String getOrganizations_url() {
            return organizations_url;
        }

        public void setOrganizations_url(String organizations_url) {
            this.organizations_url = organizations_url;
        }

        public String getRepos_url() {
            return repos_url;
        }

        public void setRepos_url(String repos_url) {
            this.repos_url = repos_url;
        }

        public String getEvents_url() {
            return events_url;
        }

        public void setEvents_url(String events_url) {
            this.events_url = events_url;
        }

        public String getReceived_events_url() {
            return received_events_url;
        }

        public void setReceived_events_url(String received_events_url) {
            this.received_events_url = received_events_url;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public boolean isSite_admin() {
            return site_admin;
        }

        public void setSite_admin(boolean site_admin) {
            this.site_admin = site_admin;
        }
    }
}
