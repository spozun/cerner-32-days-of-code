# cerner_2^5_2019

$issueId = Read-Host -Prompt 'Input JIRA2 number (eg SOARFIN-28243): '
$request = "https://jira2.cerner.com/rest/api/latest/issue/" + $issueId
$content = Invoke-WebRequest $request | ConvertFrom-Json

"JIRA : " + $issueId
"Assigned to: " + $content.fields.assignee.displayName
"Summary: " + $content.fields.summary