.class public Lcom/sma/smartv3/model/SportRecordItemData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final iv:I

.field private final tv:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "tv"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/model/SportRecordItemData;->tv:Ljava/lang/String;

    iput p2, p0, Lcom/sma/smartv3/model/SportRecordItemData;->iv:I

    return-void
.end method


# virtual methods
.method public final getIv()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/SportRecordItemData;->iv:I

    return v0
.end method

.method public final getTv()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/SportRecordItemData;->tv:Ljava/lang/String;

    return-object v0
.end method
