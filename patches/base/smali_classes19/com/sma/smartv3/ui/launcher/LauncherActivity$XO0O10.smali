.class public final Lcom/sma/smartv3/ui/launcher/LauncherActivity$XO0O10;
.super Lcom/sma/smartv3/biz/ad/ADPCAdListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/launcher/LauncherActivity;->initADPCAd()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/launcher/LauncherActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/launcher/LauncherActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/launcher/LauncherActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/launcher/LauncherActivity;

    invoke-direct {p0}, Lcom/sma/smartv3/biz/ad/ADPCAdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onADClicked(Ljava/lang/String;)V
    .locals 2

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XXXiXXOI()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/sma/smartv3/biz/StatManager;->OXO1:Lcom/sma/smartv3/biz/StatManager;

    const/16 v1, 0x13

    invoke-virtual {v0, v1, p1}, Lcom/sma/smartv3/biz/StatManager;->XIi00iiXO(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onADPresent(Ljava/lang/String;)V
    .locals 2

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/LauncherActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/launcher/LauncherActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/launcher/LauncherActivity;->access$saveDisplayAd(Lcom/sma/smartv3/ui/launcher/LauncherActivity;)Z

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XXXiXXOI()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/sma/smartv3/biz/StatManager;->OXO1:Lcom/sma/smartv3/biz/StatManager;

    const/16 v1, 0x12

    invoke-virtual {v0, v1, p1}, Lcom/sma/smartv3/biz/StatManager;->XIi00iiXO(ILjava/lang/String;)V

    :cond_0
    return-void
.end method
