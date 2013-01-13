function createSurvey(title) {
    $.post(
        getApiUrl() + "survey/v10",
        {
            title: title
        }
    )
    .success(function(data) {
        alert(data);
    });
}

function getSurveys(callback) {
    $.jsonp({
        url: getApiUrl() + "survey/v10",
        callbackParameter: "callback",
        success: callback
    });
}
