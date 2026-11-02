.class public Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/tool/WatchCacheManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WatchCache"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:Z

.field public d:S


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCrc16()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;->d:S

    return v0
.end method

.method public getWriteLen()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;->b:I

    return v0
.end method

.method public getWriteOffset()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;->a:I

    return v0
.end method

.method public isNeedCheckReadData()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;->c:Z

    return v0
.end method

.method public setCrc16(S)Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;
    .locals 0

    iput-short p1, p0, Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;->d:S

    return-object p0
.end method

.method public setNeedCheckReadData(Z)Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;->c:Z

    return-object p0
.end method

.method public setWriteLen(I)Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;->b:I

    return-object p0
.end method

.method public setWriteOffset(I)Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;->a:I

    return-object p0
.end method
