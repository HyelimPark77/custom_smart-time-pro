.class public final Lcom/sma/smartv3/ui/sport/SportDetailChartFragment$OXO1;
.super Lcom/android/mltcode/paycertificationapi/q4;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->showPace(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic iO:Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment$OXO1;->iO:Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;

    invoke-direct {p0}, Lcom/android/mltcode/paycertificationapi/q4;-><init>()V

    return-void
.end method


# virtual methods
.method public I0IIOi(F)Ljava/lang/String;
    .locals 1

    float-to-int p1, p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment$OXO1;->iO:Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/cp5;->Ii1iii0(II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
