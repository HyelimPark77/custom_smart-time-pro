.class public final Lcom/sma/smartv3/model/UserOrderKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final getVipBenefitList()Ljava/util/List;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/VipBenefit;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/sma/smartv3/model/VipBenefit;

    const v2, 0x7f140f33

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/sma/smartv3/model/VipBenefitType;->AI:Lcom/sma/smartv3/model/VipBenefitType;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/VipBenefitType;->getType()I

    move-result v3

    const v4, 0x7f08185f

    invoke-direct {v1, v2, v4, v3}, Lcom/sma/smartv3/model/VipBenefit;-><init>(Ljava/lang/String;II)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->OiO()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Lcom/sma/smartv3/model/VipBenefit;

    const v2, 0x7f140f32

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/sma/smartv3/model/VipBenefitType;->AIGC:Lcom/sma/smartv3/model/VipBenefitType;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/VipBenefitType;->getType()I

    move-result v3

    const v4, 0x7f08185e

    invoke-direct {v1, v2, v4, v3}, Lcom/sma/smartv3/model/VipBenefit;-><init>(Ljava/lang/String;II)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/sma/smartv3/model/VipBenefit;

    const v2, 0x7f140f3a

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/sma/smartv3/model/VipBenefitType;->DIAL:Lcom/sma/smartv3/model/VipBenefitType;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/VipBenefitType;->getType()I

    move-result v3

    const v4, 0x7f081861

    invoke-direct {v1, v2, v4, v3}, Lcom/sma/smartv3/model/VipBenefit;-><init>(Ljava/lang/String;II)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    new-instance v1, Lcom/sma/smartv3/model/VipBenefit;

    const v2, 0x7f140f31

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/sma/smartv3/model/VipBenefitType;->BUY_VIP:Lcom/sma/smartv3/model/VipBenefitType;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/VipBenefitType;->getType()I

    move-result v4

    const v5, 0x7f08185d

    invoke-direct {v1, v2, v5, v4}, Lcom/sma/smartv3/model/VipBenefit;-><init>(Ljava/lang/String;II)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/sma/smartv3/model/VipBenefit;

    const v2, 0x7f140f36

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const v4, 0x7f081860

    invoke-virtual {v3}, Lcom/sma/smartv3/model/VipBenefitType;->getType()I

    move-result v3

    invoke-direct {v1, v2, v4, v3}, Lcom/sma/smartv3/model/VipBenefit;-><init>(Ljava/lang/String;II)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method
