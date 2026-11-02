.class public final Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$bindPhone$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->bindPhone(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    value = "SMAP\nPhoneBindGuideFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneBindGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$bindPhone$2$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,261:1\n11#2,2:262\n*S KotlinDebug\n*F\n+ 1 PhoneBindGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$bindPhone$2$1\n*L\n227#1:262,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPhoneBindGuideFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneBindGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$bindPhone$2$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,261:1\n11#2,2:262\n*S KotlinDebug\n*F\n+ 1 PhoneBindGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$bindPhone$2$1\n*L\n227#1:262,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;

.field public final synthetic XIi00iiXO:Ljava/lang/String;

.field public final synthetic iO:Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/coroutines/Continuation<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$bindPhone$2$1;->OXO1:Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$bindPhone$2$1;->XIi00iiXO:Ljava/lang/String;

    iput-object p3, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$bindPhone$2$1;->iO:Lkotlin/coroutines/Continuation;

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

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$bindPhone$2$1;->OXO1:Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->access$getMAppUser$p(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;)Lcom/sma/smartv3/model/AppUser;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$bindPhone$2$1;->XIi00iiXO:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/model/AppUser;->setPhone(Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$bindPhone$2$1;->OXO1:Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->access$getMAppUser$p(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;)Lcom/sma/smartv3/model/AppUser;

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

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$bindPhone$2$1;->iO:Lkotlin/coroutines/Continuation;

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

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

    const p1, 0x7f140baf

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$bindPhone$2$1;->iO:Lkotlin/coroutines/Continuation;

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$bindPhone$2$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
