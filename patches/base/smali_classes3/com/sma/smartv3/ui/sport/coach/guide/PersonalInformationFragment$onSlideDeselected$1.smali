.class public final Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment$onSlideDeselected$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->onSlideDeselected()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/sma/smartv3/model/AppUser;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPersonalInformationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonalInformationFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment$onSlideDeselected$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,252:1\n11#2,2:253\n11#2,2:255\n*S KotlinDebug\n*F\n+ 1 PersonalInformationFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment$onSlideDeselected$1\n*L\n228#1:253,2\n234#1:255,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPersonalInformationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonalInformationFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment$onSlideDeselected$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,252:1\n11#2,2:253\n11#2,2:255\n*S KotlinDebug\n*F\n+ 1 PersonalInformationFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment$onSlideDeselected$1\n*L\n228#1:253,2\n234#1:255,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment$onSlideDeselected$1;->OXO1:Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/model/AppUser;)V
    .locals 3

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment$onSlideDeselected$1;->OXO1:Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->access$getMAppUser$p(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Lcom/sma/smartv3/model/AppUser;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "PersonalInformationActivity doneClick  handleError "

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "IS_LOGIN_USERINFO_ERROR"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment$onSlideDeselected$1;->OXO1:Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;->access$getMAppUser$p(Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment;)Lcom/sma/smartv3/model/AppUser;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment$onSlideDeselected$1;->OXO1(Lcom/sma/smartv3/model/AppUser;)V

    return-void
.end method
