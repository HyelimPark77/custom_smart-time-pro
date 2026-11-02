.class public final Lcom/sma/smartv3/ui/login/PhoneBindActivity$changePhone$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/login/PhoneBindActivity;->changePhone(Ljava/lang/String;)V
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
    value = "SMAP\nPhoneBindActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneBindActivity.kt\ncom/sma/smartv3/ui/login/PhoneBindActivity$changePhone$2\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n87#2,7:215\n94#2,3:223\n70#2,7:226\n97#2:233\n1#3:222\n*S KotlinDebug\n*F\n+ 1 PhoneBindActivity.kt\ncom/sma/smartv3/ui/login/PhoneBindActivity$changePhone$2\n*L\n167#1:215,7\n167#1:223,3\n167#1:226,7\n167#1:233\n167#1:222\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPhoneBindActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneBindActivity.kt\ncom/sma/smartv3/ui/login/PhoneBindActivity$changePhone$2\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n87#2,7:215\n94#2,3:223\n70#2,7:226\n97#2:233\n1#3:222\n*S KotlinDebug\n*F\n+ 1 PhoneBindActivity.kt\ncom/sma/smartv3/ui/login/PhoneBindActivity$changePhone$2\n*L\n167#1:215,7\n167#1:223,3\n167#1:226,7\n167#1:233\n167#1:222\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/login/PhoneBindActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity$changePhone$2;->OXO1:Lcom/sma/smartv3/ui/login/PhoneBindActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 4

    iget-object p1, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity$changePhone$2;->OXO1:Lcom/sma/smartv3/ui/login/PhoneBindActivity;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "mArg0"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "mArg1"

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "mArg2"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v1, "mArg3"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/sma/smartv3/ui/login/PhoneBindActivity;

    invoke-direct {v1, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p1, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity$changePhone$2;->OXO1:Lcom/sma/smartv3/ui/login/PhoneBindActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/login/PhoneBindActivity$changePhone$2;->OXO1:Lcom/sma/smartv3/ui/login/PhoneBindActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/login/PhoneBindActivity;->access$getTvCodeError(Lcom/sma/smartv3/ui/login/PhoneBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/login/PhoneBindActivity$changePhone$2;->OXO1(Ljava/lang/String;)V

    return-void
.end method
