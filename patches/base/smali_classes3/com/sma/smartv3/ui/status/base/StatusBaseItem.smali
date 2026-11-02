.class public abstract Lcom/sma/smartv3/ui/status/base/StatusBaseItem;
.super Lcom/angcyo/dsladapter/DslAdapterItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/angcyo/dsladapter/DslAdapterItem;"
    }
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseItem;->mContext:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final getMContext()Landroid/content/Context;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseItem;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public abstract update(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public abstract updateOtherData()V
.end method
