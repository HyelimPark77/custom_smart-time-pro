.class public Lcom/jieli/jl_rcsp/model/device/WatchSettingInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mask:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/WatchSettingInfo;->mask:I

    return-void
.end method


# virtual methods
.method public isSupport(I)Z
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/WatchSettingInfo;->mask:I

    shr-int p1, v0, p1

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public setMask(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/WatchSettingInfo;->mask:I

    return-void
.end method
