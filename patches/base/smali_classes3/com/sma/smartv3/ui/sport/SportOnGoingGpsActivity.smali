.class public final Lcom/sma/smartv3/ui/sport/SportOnGoingGpsActivity;
.super Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSportOnGoingGpsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportOnGoingGpsActivity.kt\ncom/sma/smartv3/ui/sport/SportOnGoingGpsActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n87#2,7:23\n94#2,3:31\n70#2,7:34\n97#2:41\n1#3:30\n*S KotlinDebug\n*F\n+ 1 SportOnGoingGpsActivity.kt\ncom/sma/smartv3/ui/sport/SportOnGoingGpsActivity\n*L\n13#1:23,7\n13#1:31,3\n13#1:34,7\n13#1:41\n13#1:30\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSportOnGoingGpsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportOnGoingGpsActivity.kt\ncom/sma/smartv3/ui/sport/SportOnGoingGpsActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n87#2,7:23\n94#2,3:31\n70#2,7:34\n97#2:41\n1#3:30\n*S KotlinDebug\n*F\n+ 1 SportOnGoingGpsActivity.kt\ncom/sma/smartv3/ui/sport/SportOnGoingGpsActivity\n*L\n13#1:23,7\n13#1:31,3\n13#1:34,7\n13#1:41\n13#1:30\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->X0OXOI()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result p1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg3()Ljava/io/Serializable;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "mArg0"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "mArg1"

    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "mArg2"

    invoke-virtual {v1, p1, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {v1, p1, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method public initView()V
    .locals 0

    invoke-super {p0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->initView()V

    return-void
.end method
