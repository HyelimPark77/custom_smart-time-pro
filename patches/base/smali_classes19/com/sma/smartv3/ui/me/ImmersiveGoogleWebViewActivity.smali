.class public Lcom/sma/smartv3/ui/me/ImmersiveGoogleWebViewActivity;
.super Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public initView()V
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->transparentNavBar()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->transparentStatusBar()V

    invoke-super {p0}, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->initView()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00c5

    return v0
.end method
