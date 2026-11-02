.class public abstract Lcom/sma/smartv3/otherdevice/charge/BaseChargeActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public initView()V
    .locals 2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0600ad

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, p0, v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->setStatusBarColor(Landroid/app/Activity;I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0600ab

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, p0, v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->setNavBarColor(Landroid/app/Activity;I)V

    return-void
.end method
