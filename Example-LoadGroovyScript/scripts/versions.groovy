def doVersion(versions) {
    def release = version."RELEASE"
    return [
        Release: release,
        RCP: "${release}.${build}"
    ]
}

def doA() {
    return "AA"
}

def doB(String s) {
    return "AA==>${s}"
}

return this;