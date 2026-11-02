.class public final Lcom/sma/smartv3/view/ContactSideBar$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/view/ContactSideBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OXO1"
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
    invoke-direct {p0}, Lcom/sma/smartv3/view/ContactSideBar$OXO1;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1()[Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {}, Lcom/sma/smartv3/view/ContactSideBar;->OXO1()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final XIi00iiXO([Ljava/lang/String;)V
    .locals 1
    .param p1    # [Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/sma/smartv3/view/ContactSideBar;->XIi00iiXO([Ljava/lang/String;)V

    return-void
.end method
