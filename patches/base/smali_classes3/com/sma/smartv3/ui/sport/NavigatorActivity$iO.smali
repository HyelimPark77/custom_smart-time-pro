.class public final Lcom/sma/smartv3/ui/sport/NavigatorActivity$iO;
.super Lcom/android/mltcode/paycertificationapi/q4;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/NavigatorActivity;->initItemView(Lcom/angcyo/dsladapter/DslViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic XO0O10:Lcom/sma/smartv3/ui/sport/NavigatorActivity;

.field public final synthetic iO:Lkotlin/jvm/internal/Ref$IntRef;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/ui/sport/NavigatorActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$iO;->iO:Lkotlin/jvm/internal/Ref$IntRef;

    iput-object p2, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$iO;->XO0O10:Lcom/sma/smartv3/ui/sport/NavigatorActivity;

    invoke-direct {p0}, Lcom/android/mltcode/paycertificationapi/q4;-><init>()V

    return-void
.end method


# virtual methods
.method public I0IIOi(F)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$iO;->iO:Lkotlin/jvm/internal/Ref$IntRef;

    iget v0, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    if-nez v0, :cond_0

    float-to-int p1, p1

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OX110i(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    float-to-int p1, p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$iO;->XO0O10:Lcom/sma/smartv3/ui/sport/NavigatorActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->access$getUserProfile$p(Lcom/sma/smartv3/ui/sport/NavigatorActivity;)Lcom/sma/smartv3/model/AppUser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/cp5;->Ii1iii0(II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
