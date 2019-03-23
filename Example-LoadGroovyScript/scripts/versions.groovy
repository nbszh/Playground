def call(String build, Properties versions) {
    def release = version."RELEASE"
    return [
        Release: release,
        RCP: "${release}.${build}"
    ]
}

return this;