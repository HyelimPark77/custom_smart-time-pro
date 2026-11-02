.class public final Lcom/bestmafen/androidbase/base/BaseApplication$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bestmafen/androidbase/base/BaseApplication;
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
    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseApplication$OXO1;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1()Ljava/util/concurrent/LinkedBlockingQueue;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    invoke-static {}, Lcom/bestmafen/androidbase/base/BaseApplication;->OXO1()Ljava/util/concurrent/LinkedBlockingQueue;

    move-result-object v0

    return-object v0
.end method
