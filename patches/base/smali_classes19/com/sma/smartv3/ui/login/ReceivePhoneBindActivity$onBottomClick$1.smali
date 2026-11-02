.class public final Lcom/sma/smartv3/ui/login/ReceivePhoneBindActivity$onBottomClick$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/login/ReceivePhoneBindActivity;->onBottomClick(Landroid/view/View;)V
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
    value = "SMAP\nReceivePhoneBindActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReceivePhoneBindActivity.kt\ncom/sma/smartv3/ui/login/ReceivePhoneBindActivity$onBottomClick$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,119:1\n11#2,2:120\n*S KotlinDebug\n*F\n+ 1 ReceivePhoneBindActivity.kt\ncom/sma/smartv3/ui/login/ReceivePhoneBindActivity$onBottomClick$1\n*L\n85#1:120,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nReceivePhoneBindActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReceivePhoneBindActivity.kt\ncom/sma/smartv3/ui/login/ReceivePhoneBindActivity$onBottomClick$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,119:1\n11#2,2:120\n*S KotlinDebug\n*F\n+ 1 ReceivePhoneBindActivity.kt\ncom/sma/smartv3/ui/login/ReceivePhoneBindActivity$onBottomClick$1\n*L\n85#1:120,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/login/ReceivePhoneBindActivity;

.field public final synthetic XIi00iiXO:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/login/ReceivePhoneBindActivity;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/login/ReceivePhoneBindActivity$onBottomClick$1;->OXO1:Lcom/sma/smartv3/ui/login/ReceivePhoneBindActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/login/ReceivePhoneBindActivity$onBottomClick$1;->XIi00iiXO:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleResponse -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/login/ReceivePhoneBindActivity$onBottomClick$1;->OXO1:Lcom/sma/smartv3/ui/login/ReceivePhoneBindActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/login/ReceivePhoneBindActivity;->access$getMAppUser$p(Lcom/sma/smartv3/ui/login/ReceivePhoneBindActivity;)Lcom/sma/smartv3/model/AppUser;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/ReceivePhoneBindActivity$onBottomClick$1;->XIi00iiXO:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/model/AppUser;->setReceivePhone(Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/ReceivePhoneBindActivity$onBottomClick$1;->OXO1:Lcom/sma/smartv3/ui/login/ReceivePhoneBindActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/login/ReceivePhoneBindActivity;->access$getMAppUser$p(Lcom/sma/smartv3/ui/login/ReceivePhoneBindActivity;)Lcom/sma/smartv3/model/AppUser;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v0, 0x2

    const-string v1, "UPDATE_RECEIVE_PHONE_NUMBER"

    invoke-static {v1, p1, v0, p1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/login/ReceivePhoneBindActivity$onBottomClick$1;->OXO1:Lcom/sma/smartv3/ui/login/ReceivePhoneBindActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleError -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/login/ReceivePhoneBindActivity$onBottomClick$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
