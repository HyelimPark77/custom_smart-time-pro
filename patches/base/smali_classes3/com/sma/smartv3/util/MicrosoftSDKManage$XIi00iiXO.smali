.class public final Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/util/MicrosoftSDKManage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "XIi00iiXO"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->OII()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    return-object v0
.end method

.method public final XIi00iiXO(Lcom/sma/smartv3/util/MicrosoftSDKManage;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/util/MicrosoftSDKManage;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iX(Lcom/sma/smartv3/util/MicrosoftSDKManage;)V

    return-void
.end method
