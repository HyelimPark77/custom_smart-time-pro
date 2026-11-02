.class public final Lcom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/login/EmailBindActivity;->changeEmail(Ljava/lang/String;)V
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
    value = "SMAP\nEmailBindActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmailBindActivity.kt\ncom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,289:1\n11#2,2:290\n69#3,3:292\n72#3,5:296\n1#4:295\n*S KotlinDebug\n*F\n+ 1 EmailBindActivity.kt\ncom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$1\n*L\n150#1:290,2\n153#1:292,3\n153#1:296,5\n153#1:295\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEmailBindActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmailBindActivity.kt\ncom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,289:1\n11#2,2:290\n69#3,3:292\n72#3,5:296\n1#4:295\n*S KotlinDebug\n*F\n+ 1 EmailBindActivity.kt\ncom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$1\n*L\n150#1:290,2\n153#1:292,3\n153#1:296,5\n153#1:295\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/login/EmailBindActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$1;->OXO1:Lcom/sma/smartv3/ui/login/EmailBindActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/model/AppUser;)V
    .locals 3

    iget-object p1, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$1;->OXO1:Lcom/sma/smartv3/ui/login/EmailBindActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->access$getMAppUser(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/sma/smartv3/model/AppUser;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$1;->OXO1:Lcom/sma/smartv3/ui/login/EmailBindActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->access$getEmail(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/model/AppUser;->setEmail(Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$1;->OXO1:Lcom/sma/smartv3/ui/login/EmailBindActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->access$getMAppUser(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/sma/smartv3/model/AppUser;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "UPDATE_EMAIL_ADDRESS"

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$1;->OXO1:Lcom/sma/smartv3/ui/login/EmailBindActivity;

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result p1

    if-ne p1, v1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$1;->OXO1:Lcom/sma/smartv3/ui/login/EmailBindActivity;

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/main/MainActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$1;->OXO1:Lcom/sma/smartv3/ui/login/EmailBindActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$1;->OXO1:Lcom/sma/smartv3/ui/login/EmailBindActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->access$getTvCodeError(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/login/EmailBindActivity$changeEmail$1;->OXO1(Lcom/sma/smartv3/model/AppUser;)V

    return-void
.end method
