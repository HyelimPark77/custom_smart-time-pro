.class public final Lcom/sma/smartv3/ui/device/dial/DialActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dial/DialActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/dial/DialActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/dial/DialActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/DialActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/dial/DialActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTabReselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    return-void
.end method

.method public onTabSelected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/dial/DialActivity;

    const v1, 0x7f1400f9

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dial/DialActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/dial/DialActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->isShowAiKeyPop()Z

    move-result p1

    if-nez p1, :cond_1

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->O0()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->iIiiO()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dial/DialActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/dial/DialActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->access$getMContext(Lcom/sma/smartv3/ui/device/dial/DialActivity;)Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXiO0i(Landroid/app/Activity;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dial/DialActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/dial/DialActivity;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->setShowAiKeyPop(Z)V

    :cond_1
    return-void
.end method

.method public onTabUnselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    return-void
.end method
