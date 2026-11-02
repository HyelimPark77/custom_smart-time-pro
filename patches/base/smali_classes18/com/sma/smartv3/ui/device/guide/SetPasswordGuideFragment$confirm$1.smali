.class public final Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment$confirm$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->confirm()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSetPasswordGuideFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetPasswordGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment$confirm$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,137:1\n11#2,2:138\n*S KotlinDebug\n*F\n+ 1 SetPasswordGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment$confirm$1\n*L\n104#1:138,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSetPasswordGuideFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetPasswordGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment$confirm$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,137:1\n11#2,2:138\n*S KotlinDebug\n*F\n+ 1 SetPasswordGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment$confirm$1\n*L\n104#1:138,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment$confirm$1;->OXO1:Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 3

    const p1, 0x7f1410a1

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment$confirm$1;->OXO1:Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->access$getMAppUser$p(Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;)Lcom/sma/smartv3/model/AppUser;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/model/AppUser;->setPasswordStatus(Z)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment$confirm$1;->OXO1:Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;->access$getMAppUser$p(Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;)Lcom/sma/smartv3/model/AppUser;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment$confirm$1;->OXO1:Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroid/app/Activity;->setResult(I)V

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment$confirm$1;->OXO1:Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_1
    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/guide/SetPasswordGuideFragment$confirm$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
