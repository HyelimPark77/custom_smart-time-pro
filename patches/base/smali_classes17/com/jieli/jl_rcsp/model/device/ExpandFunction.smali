.class public Lcom/jieli/jl_rcsp/model/device/ExpandFunction;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final MASK_DYNAMIC_LIMITER:I = 0x2

.field public static final MASK_REVERBERATION:I = 0x1


# instance fields
.field private final dataMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "[B>;"
        }
    .end annotation
.end field

.field private mask:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/ExpandFunction;->dataMap:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public getData(I)[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/ExpandFunction;->dataMap:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    return-object p1
.end method

.method public getMask()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/ExpandFunction;->mask:I

    return v0
.end method

.method public putData(I[B)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/ExpandFunction;->dataMap:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setMask(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/ExpandFunction;->mask:I

    return-void
.end method
